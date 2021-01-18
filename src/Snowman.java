import java.util.ArrayList;
import java.util.List;

    public class Snowman {

        List<String> snowman;

        public Snowman() {
            this.snowman = new ArrayList<>();
        }

        public void acceptElement(Kid kid) {
            snowman.add(kid.getElement());
        }
    }



