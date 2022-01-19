import datetime
import shutil
import sys


def main():
    javaFileName = sys.argv[1]

    shutil.copy(".resource/ModelAnswer.java", f"{javaFileName}")
    shutil.copy(".resource/testcase.txt", "./")

    print(f"模範解答プログラム({javaFileName})とテストケース(testcase.txt)を出現させました")

    try:
        with open(".result/start.log", "x") as f:
            f.write(str(datetime.datetime.now()))

        print("開始時刻を記録しました")

    except FileExistsError:
        print("既に開始時刻は記録されています")


if __name__ == "__main__":
    main()
