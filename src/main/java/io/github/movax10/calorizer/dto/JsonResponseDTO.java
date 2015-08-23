package io.github.movax10.calorizer.dto;

/**
 * @author Roman Voloboev
 */
public class JsonResponseDTO {
    private String status;
    private Object data;
    private String message;

    public JsonResponseDTO() {
    }

    public JsonResponseDTO(String status, String message) {
        this.status = status;
        this.data = null;
        this.message = message;
    }

    public JsonResponseDTO(String status, Object data) {
        this.status = status;
        this.data = data;
        this.message = null;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
