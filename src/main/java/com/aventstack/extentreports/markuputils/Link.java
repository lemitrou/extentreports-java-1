package com.aventstack.extentreports.markuputils;

class Link implements Markup {

    private static final long serialVersionUID = 548763908072445261L;
    
    private String text = "";
    private String href = "";

    public void setText(String text) {
        this.text = text;
    }
    public String getText() { return text; }

    public void setHref(String href) {
        this.href = href;
    }
    public String getHref() { return href; }

    public String getMarkup() {
        String lhs = "<a href=\"" + href + "\" target=\"_blank\">"+ text + "</href>";
        
        return lhs;
    }
}
