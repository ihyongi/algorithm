package fastcampus.class02.ch01문자열;

import java.util.Scanner;

/**
 * 철수는 화학 시험을 망치고, 애꿎은 화학 선생님에게 복수를하기로 한다.
 * 철수는 집에서 만든 자동 로봇팔을 선생님의 책상에 숨겨,
 * 선생님이 수업을 시작하려 들어온 순간 숨겨놓은 로봇팔을 이용해 선생님을 혼내주려고한다.
 * 철수는 선생님이 늘 애용하는 물컵에 시간이 되면 로봇팔이 소금을 잔뜩 집어넣도록 프로그램을 짜려고한다.
 *
 * 철수는 현재시각과 선생님이 언제 컵을 사용할지 시간을 알고있지만,
 * 수 계산에 정말 약해서 로봇팔에 입력해야할 시간 계산을 못한다.
 * 철수가 로봇팔에 알맞은 시간을 입력할수 있도록 도와주자.
 */
class Main_13223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String current = sc.next(); //현재시간
        String drop = sc.next(); //소금투하시간

        //spilt
        int currentSecond = getSecond(current);
        int dropSecond = getSecond(drop);
        int needSecondAmount = dropSecond - currentSecond;
        if (needSecondAmount <= 0){
            //하루를 초로 표현한 값을 더해줌
            needSecondAmount += 24 * 3600;
        }

        //이제 다시 시간으로 보여주기
        int needHour = needSecondAmount / 3600; //몫이 시간
        int needMin = (needSecondAmount % 3600) /60; //나머지에 대해서 분이랑 초 구하기
        int needSec = needSecondAmount % 60; //나머지가 초

        //format
        System.out.printf("%02d:%02d:%02d", needHour, needMin, needSec);
        /**
         * 주의!!
         * 이 시간은 1초보다 크거나 같고, 24시간보다 작거나 같다.
         * 음.. needSecondAmount가 0이 나올 수 있는것을 정의한건데 몬소린지 모르겠다.
         * 0일때는 24시간으로 나오게 하면 된다는 말이라고 하는데..음...
         */

    }

    private static int getSecond(String current) {
        String[] currentUnit = current.split(":");
        int currentHour = Integer.parseInt(currentUnit[0]);
        int currentMin = Integer.parseInt(currentUnit[1]);
        int currentSec = Integer.parseInt(currentUnit[2]);

        return currentHour * 3600 + currentMin * 60 + currentSec;
    }
}
