/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author 91983
 */
public class RehabWorkRequest extends WorkRequest{

    public String getRehabConcern() {
        return rehabConcern;
    }

    public void setRehabConcern(String rehabConcern) {
        this.rehabConcern = rehabConcern;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStability() {
        return stability;
    }

    public void setStability(String stability) {
        this.stability = stability;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }
    
    private String rehabConcern;
    private String result;
    private String comments;
    private String stability;
    private String behaviour;
        private String CitizenName;
        private String CitizenEmail;

    public String getCitizenEmail() {
        return CitizenEmail;
    }

    public void setCitizenEmail(String CitizenEmail) {
        this.CitizenEmail = CitizenEmail;
    }

    public String getCitizenName() {
        return CitizenName;
    }

    public void setCitizenName(String CitizenName) {
        this.CitizenName = CitizenName;
    }
    public String getReturn_Result() {
        return return_Result;
    }

    public void setReturn_Result(String return_Result) {
        this.return_Result = return_Result;
    }

    public String getReturn_Comment() {
        return return_Comment;
    }

    public void setReturn_Comment(String return_Comment) {
        this.return_Comment = return_Comment;
    }
    private String return_Result;
    private String return_Comment;
    
}
