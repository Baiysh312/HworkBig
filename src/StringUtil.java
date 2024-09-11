public class StringUtil{
    private StringActions stringActions;

    public StringUtil() {
    }

    public StringUtil(StringActions stringActions) {
        this.stringActions = stringActions;
    }
    public String concatStr(String str1, String str2){
        return stringActions.concat(str1,str2);
    }
}