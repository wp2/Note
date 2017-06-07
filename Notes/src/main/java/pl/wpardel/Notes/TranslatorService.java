package pl.wpardel.Notes;

import org.springframework.stereotype.Service;

import com.ibm.watson.developer_cloud.language_translator.v2.LanguageTranslator;
import com.ibm.watson.developer_cloud.language_translator.v2.model.Language;
import com.ibm.watson.developer_cloud.language_translator.v2.model.TranslationResult;

@Service
public class TranslatorService
{
	LanguageTranslator langTranslator = new LanguageTranslator();
	
	public String translate(String input)
	{
		langTranslator.setUsernameAndPassword("dd1087b0-6eee-4e0a-860a-7275ce23d7ed", "ZrkYWKADneDm");
		TranslationResult TR =  langTranslator.translate(input, Language.ENGLISH,Language.SPANISH).execute();
		return TR.getFirstTranslation();
	}

}
