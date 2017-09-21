package tester;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pravien
 */
public class Group
{
    private String authors,classs,groupno;

    public Group(String authors, String classs, String groupno)
    {
        this.authors = authors;
        this.classs = classs;
        this.groupno = groupno;
    }

    public String getAuthors()
    {
        return authors;
    }

    public void setAuthors(String authors)
    {
        this.authors = authors;
    }

    public String getClasss()
    {
        return classs;
    }

    public void setClasss(String classs)
    {
        this.classs = classs;
    }

    public String getGroupno()
    {
        return groupno;
    }

    public void setGroupno(String groupno)
    {
        this.groupno = groupno;
    }
    
    
}
