package com.baosight.bean;  
  
import com.baosight.util.GenerateUUID;  
  
/** 
 * <p>Title:UserBean </p> 
 * <p>Description:TODO </p> 
 * <p>Company: </p>  
 * @author zhangbin  
 * @date 2018-6-20 ����2:40:24*/  
public class UserBean {  
    //��¼��֤  
    public boolean valid(String username,String password){  
        boolean isValid = false;  
        DBAcess db = new DBAcess();  
        if(db.createConn()){  
            String sql = "select * from p_user where username='"+username+"' and password='"+password+"'";  
            db.query(sql);  
            if(db.next()){  
                isValid = true;  
            }  
            db.closeRs();  
            db.closeStm();  
            db.closeConn();  
        }  
        return isValid;  
    }  
    //ע����֤  
    public boolean isExist(String username){  
        boolean isValid = false;  
        DBAcess db = new DBAcess();  
        if(db.createConn()){  
            String sql = "select * from p_user where username='"+username+"'";  
            db.query(sql);  
            if(db.next()){  
                isValid = true;  
            }  
            db.closeRs();  
            db.closeStm();  
            db.closeConn();  
        }  
        return isValid;  
    }  
    //ע���û�  
    public boolean add(String username,String password,String email){  
        boolean isValid = false;  
        DBAcess db = new DBAcess();  
        if(db.createConn()){  
            String sql = "insert into p_user(id,username,password,email) values('"+GenerateUUID.next()+"','"+username+"','"+password+"','"+email+"')";  
            isValid = db.update(sql);  
            db.closeStm();  
            db.closeConn();  
        }  
        return isValid;  
    }  
}  