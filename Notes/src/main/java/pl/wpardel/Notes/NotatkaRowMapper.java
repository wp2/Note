package pl.wpardel.Notes;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class NotatkaRowMapper implements RowMapper<Notatka> {

	@Override
	public Notatka mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return new Notatka(rs.getInt("id"), rs.getString("tagi"), rs.getString("tytul"), rs.getString("tresc"));
	}

}
