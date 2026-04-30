/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
            if (intervals.isEmpty()) {
                return true;
            }
            intervals.sort(Comparator.comparing(i -> i.start));
            List<Interval> times = new ArrayList<>();
            int i;
            for (i = 0; i < intervals.size(); i++) {
                if (i == 0) {
                    times.add(intervals.get(i));
                    continue;
                }
                if (intervals.get(i).start < times.get(i-1).end){
                        return false;    
                }
                times.add(intervals.get(i));
            }
            return true;
    }
}
