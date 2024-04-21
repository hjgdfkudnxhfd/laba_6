package dbService;

import org.example.Model.AccountUser;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class UsersDAO {
    private Session session;

    public UsersDAO(Session session) {
        this.session = session;
    }

    public AccountUser get(String login) throws HibernateException {
        return (AccountUser) session.get(AccountUser.class, login);
    }

    public void insertUser(AccountUser user) throws HibernateException {
        session.save(user);
    }
}