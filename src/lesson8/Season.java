package lesson8;

import java.awt.*;

public enum Season {
    WINTER(Color.WHITE),
    SPRING(Color.GREEN),
    SUMMER(Color.ORANGE),
    AUTUMN(Color.YELLOW);

    private final Color color;

    Season(Color color){
        this.color=color;
    }

    public String getColor() {
        if (this.color.equals(Color.WHITE)){
            return "Белый";
        }
        if (this.color.equals(Color.ORANGE)){
            return "Зеленый";
        }
        if (this.color.equals(Color.GREEN)){
            return "Оранжевый";
        }
        if (this.color.equals(Color.YELLOW)){
            return "Желтый";
        }
        return this.color.toString();
    }
}
