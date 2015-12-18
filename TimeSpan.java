import java.util.Date;

public class TimeSpan {
    private final Date start;
    private final Date end;
    
    public TimeSpan(Date start, Date end) {
        if (start != null && end != null && end.before(start)) {
            this.start = end;
            this.end = start;
        } else {
            this.start = start;
            this.end = end;
        }
    }
    
    /**
     * @param touchingIsOverlap if true, then 1/1-1/5 overlaps with 1/5-1/9.
     */
    public boolean overlapsWith(TimeSpan timeSpan, boolean touchingIsOverlap) {
        
        return isForever()
               || timeSpan.isForever()
               || isStartDateLessThanEndDate(start, timeSpan.end, touchingIsOverlap)
                  && isStartDateLessThanEndDate(timeSpan.start, end, touchingIsOverlap);
    }
    
    private boolean isStartDateLessThanEndDate(Date start, Date end, boolean orEqualTo) {
        return start == null
               || end == null
               || start.before(end)
               || orEqualTo && start.equals(end);
    }
    
    private boolean isForever() {
        return start == null && end == null;
    }
    
}
