package jpa;

public class JPAPagination {

    public static void main(String[] args) {
    /*
        //Using JPQL
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String jpql = "SELECT u FROM User u ORDER BY u.id";
        Query query = entityManager.createQuery(jpql);

        int pageNumber = 1;
        int pageSize = 10;

        query.setFirstResult((pageNumber - 1) * pageSize);
        query.setMaxResults(pageSize);

        List<User> users = query.getResultList();

        //Using Criteria API
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);

        Root<User> root = criteriaQuery.from(User.class);
        criteriaQuery.select(root);

        int pageNumber = 1;
        int pageSize = 10;

        criteriaQuery.orderBy(criteriaBuilder.asc(root.get("id")));
        TypedQuery<User> typedQuery = entityManager.createQuery(criteriaQuery);

        typedQuery.setFirstResult((pageNumber - 1) * pageSize);
        typedQuery.setMaxResults(pageSize);

        List<User> users = typedQuery.getResultList();
        */

        System.out.println("JPQL and Criteria API Demo");

    }
}
