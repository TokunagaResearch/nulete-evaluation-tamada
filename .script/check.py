import datetime
import pathlib
import shutil
import subprocess
import sys


def main():
    javaFileName = sys.argv[1]

    if not check(javaFileName, "ModelAnswer.java", 0):
        return

    resourceDir = pathlib.Path(".resource")
    wrongFiles = sorted(resourceDir.glob("WrongAnswer*.java"))

    for wrongFile in wrongFiles:
        if not check(javaFileName, wrongFile.name, 1):
            return

    try:
        with open(".result/end.log", "x") as f:
            f.write(str(datetime.datetime.now()))

        print("終了時刻を記録しました")

    except FileExistsError:
        print("既に終了時刻は記録されています")

    print("次の問題があれば移行してください")


def check(javaFileName, targetFileName, returncode):
    shutil.copy(f".resource/{targetFileName}", f"src/main/java/{javaFileName}")
    result = subprocess.run(["gradle", "test", "--rerun-tasks"])

    if result.returncode == returncode:
        print(f"{targetFileName}を正しく判定できました")
        return True

    print(f"{targetFileName}を正しく判定できませんでした")
    print("正誤判定プログラムを作成し直してください")
    return False


if __name__ == "__main__":
    main()
