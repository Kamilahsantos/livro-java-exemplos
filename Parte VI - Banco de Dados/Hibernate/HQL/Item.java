Query query = session.createQuery("from Item where itemid=:id");
query.setParameter("id","999");
List list= query.List();

