package Iterator;

public enum ThemeColor {
    RED,ORANGE,BLACK,WHITE;

    public static Iterator<ThemeColor> getIterator(){
        return new ThemeColorIterator();
    }

    public static class ThemeColorIterator implements Iterator<ThemeColor>{

        public int position=0;

        @Override public boolean hasNext() {
            return position<ThemeColor.values().length;
        }

        @Override public ThemeColor next() {
            return ThemeColor.values()[position++];
        }
    }
}
