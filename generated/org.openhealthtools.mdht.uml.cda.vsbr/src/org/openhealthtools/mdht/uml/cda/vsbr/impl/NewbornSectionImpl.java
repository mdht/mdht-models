/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Entry;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive;
import org.openhealthtools.mdht.uml.cda.vsbr.Plurality;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.Weight;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.NewbornSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Newborn Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NewbornSectionImpl extends SectionImpl implements NewbornSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NewbornSectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VsbrPackage.Literals.NEWBORN_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionSubject(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionSubject(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionEstimateofGestation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionEstimateofGestation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionApgarScore(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionApgarScore(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionPlurality(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionPlurality(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionBirthOrder(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionBirthOrder(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionNumberofInfantsBornAlive(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionNumberofInfantsBornAlive(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionCongenitalAnomaliesoftheNewborn(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionCongenitalAnomaliesoftheNewborn(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNewbornSectionWeight(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NewbornSectionOperations.validateNewbornSectionWeight(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstimateofGestation getEstimateofGestation()
  {
    return NewbornSectionOperations.getEstimateofGestation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ApgarScore> getApgarScores()
  {
    return NewbornSectionOperations.getApgarScores(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plurality getPlurality()
  {
    return NewbornSectionOperations.getPlurality(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BirthOrder getBirthOrder()
  {
    return NewbornSectionOperations.getBirthOrder(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberofInfantsBornAlive getNumberofInfantsBornAlive()
  {
    return NewbornSectionOperations.getNumberofInfantsBornAlive(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CongenitalAnomaliesoftheNewborn> getCongenitalAnomaliesoftheNewborns()
  {
    return NewbornSectionOperations.getCongenitalAnomaliesoftheNewborns(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Weight getWeight()
  {
    return NewbornSectionOperations.getWeight(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewbornSection init() {
    	CDAUtil.init(this);
    	return this;
  }
} //NewbornSectionImpl
