Session Factory sessionFactory = HibernateUtil.getSessionFactory();
Session session= sessionFactory.getCurrentSession();

Transaction tx= session.beginTransaction();
SQLQuery query = session.createSQLQuery("select aluno_id, aluno_nome, aluno_serie from Aluno");
List <Object[]>rows=query.List();
fot (Object[] row:rows){
    Alunos al= new Alunos();
    al.setId(Long.parseLong(row[0].toString()));
    al.setNome(row[1].toString());
    al.setSerie(Double.parseDouble(row[2].toString()));



}