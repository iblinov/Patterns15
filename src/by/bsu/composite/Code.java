package by.bsu.composite;

public class Code implements ProjectComponent {
    private long codeId;
    private CodeType type;
    private String description;
    private ReferenceGit reference;
    private long hoursRequired;
    private boolean done;

    public Code() {
    }

    public Code(long codeId, long hoursRequired, CodeType type) {
        this.codeId = codeId;
        this.hoursRequired = hoursRequired;
        this.type = type;
    }
    @Override
    public void add(ProjectComponent component) {
        // empty or generating an exception
    }
    @Override
    public void remove(ProjectComponent component) {
        // empty or generating an exception
    }
    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
    @Override
    public long defineTimeRequired() {
        System.out.println("     codeId=" + codeId +
                ", hoursRequired=" + hoursRequired);
        return done ? 0 : hoursRequired ;
    }
    public long getHoursRequired() {
        return hoursRequired;
    }
    public void setHoursRequired(long hoursRequired) {
        this.hoursRequired = hoursRequired;
    }
    public CodeType getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Code{codeId=" + codeId + ", reference=" + reference +
                ", hoursRequired=" + hoursRequired + ", type=" + type + '}';
    }
}
