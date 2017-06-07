package pl.wpardel.Notes;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NotatkaDao 
{	
	JdbcTemplate template;
	
	@Autowired
	public NotatkaDao(DataSource ds )
	{
		template = new JdbcTemplate(ds);
	}
	
	public Notatka queryForNotatka(int id)
	{
		String SQL = "SELECT * from Notatka WHERE id = "+id;		
		return template.queryForObject(SQL, new NotatkaRowMapper());
	}
	
	public List<Notatka> queryForNotatki()
	{
		String SQL = "SELECT * from Notatka";
		return template.query(SQL, new NotatkaRowMapper());
	}
	
	public boolean insertNotatka(Notatka n)
	{
		return true;
	}
	
	public boolean deleteNotatka(int notatkaId) 
	{
		return true;
	}

}
