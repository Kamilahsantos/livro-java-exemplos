public class Produto implements Serializable{
    //para recordar, a interface Serializable serve para situacoes em que
    //precisamos que a instancia do objeto seja transformada em uma
    //sequencia de bytes

    private Integer produtoId;
    private String produtoNome;
    private String produtoDescricao;
    private Integer produtoValor;


    Session session= HibernateUtil.getHibernateSession();
    CriteriaBuilder cb = session.getCriteriaBuilder();
    CriteriaQuery<Produto> cr =cb.createQuery(Produto.class);
    Root<Produto> root=cr.from (Produto.class);
    cr.select(root);

    Query<Produto> query= session.createQuery(cr);
    List<Produto> results = query.getResulList();