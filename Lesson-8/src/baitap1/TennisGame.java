package baitap1;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        if (isEqual(player1Score, player2Score)) {
            score = getEvenScore(player1Score);
        } else if (isWinning(player1Score, player2Score)) {
            score = getAdvantageousScore(player1Score, player2Score);
        } else {
            score = getRegularScore(player1Score, player2Score, score);
        }
        return score;
    }

    private static boolean isWinning(int player1Score, int player2Score) {
        return player1Score >= 4 || player2Score >= 4;
    }

    private static boolean isEqual(int player1Score, int player2Score) {
        return player1Score == player2Score;
    }

    private static String getRegularScore(int player1Score, int player2Score, String score) {
        int tempScore;
        StringBuilder scoreBuilder = new StringBuilder(score);
        for (int gettingScore = 1; gettingScore < 3; gettingScore++) {
            if (isEqual(gettingScore, 1)) tempScore = player1Score;
            else {
                scoreBuilder.append("-");
                tempScore = player2Score;
            }
            getScoreLabel(tempScore, scoreBuilder);
        }
        score = scoreBuilder.toString();
        return score;
    }

    private static void getScoreLabel(int tempScore, StringBuilder scoreBuilder) {
        switch (tempScore) {
            case 0:
                scoreBuilder.append("Love");
                break;
            case 1:
                scoreBuilder.append("Fifteen");
                break;
            case 2:
                scoreBuilder.append("Thirty");
                break;
            case 3:
                scoreBuilder.append("Forty");
                break;
        }
    }

    private static String getAdvantageousScore(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;
        if (isEqual(minusResult, 1)) score = "Advantage player1";
        else if (isEqual(minusResult, -1)) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getEvenScore(int player1Score) {
        return switch (player1Score) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            case 3 -> "Forty-All";
            default -> "Deuce";
        };
    }
}