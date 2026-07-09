// Last updated: 7/9/2026, 3:06:24 PM
class Solution {
    public String convertDateToBinary(String date) {
          String [] parts=date.split("-");
          int y=Integer.parseInt(parts[0]);
          int m=Integer.parseInt(parts[1]);
          int d=Integer.parseInt(parts[2]);
          String yb=Integer.toBinaryString(y);
          String mb=Integer.toBinaryString(m);
          String db=Integer.toBinaryString(d);
          return yb +"-"+mb+"-"+db;
    }
}