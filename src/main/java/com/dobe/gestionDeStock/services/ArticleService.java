package com.dobe.gestionDeStock.services;

import com.dobe.gestionDeStock.dto.ArticleDto;
import com.dobe.gestionDeStock.dto.LigneCommandeClientDto;
import com.dobe.gestionDeStock.dto.LigneCommandeFournisseurDto;
import com.dobe.gestionDeStock.dto.LigneVenteDto;

import java.util.List;

public interface ArticleService {

  ArticleDto save(ArticleDto dto);

  ArticleDto findById(Integer id);

  ArticleDto findByCodeArticle(String codeArticle);

  List<ArticleDto> findAll();

  List<LigneVenteDto> findHistoriqueVentes(Integer idArticle);

  List<LigneCommandeClientDto> findHistoriaueCommandeClient(Integer idArticle);

  List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(Integer idArticle);

  List<ArticleDto> findAllArticleByIdCategory(Integer idCategory);

  void delete(Integer id);

}
