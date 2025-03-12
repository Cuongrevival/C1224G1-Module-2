package SocialInternet;

public class Facebook implements SocialShare {
        String message;
        @Override
        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public void share() {
            System.out.println("Sharing to Facebook" + message);
        }
    }
