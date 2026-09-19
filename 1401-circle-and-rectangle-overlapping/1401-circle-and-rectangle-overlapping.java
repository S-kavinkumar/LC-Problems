class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xside = Math.max(x1,Math.min(xCenter,x2));
        int yside = Math.max(y1,Math.min(yCenter,y2));

        int dx = xside - xCenter;
        int dy = yside - yCenter;

        boolean flag = dx * dx + dy * dy <= radius * radius;

        return flag;
    }
}