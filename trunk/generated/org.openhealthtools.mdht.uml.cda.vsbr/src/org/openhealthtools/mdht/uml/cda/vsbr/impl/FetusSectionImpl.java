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

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionsoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.FetusSection;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.Weight;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetusSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetus Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FetusSectionImpl extends SectionImpl implements FetusSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetusSectionImpl()
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
    return VsbrPackage.Literals.FETUS_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetusSectionOperations.validateFetusSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetusSectionOperations.validateFetusSectionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetusSectionOperations.validateFetusSectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetusSectionOperations.validateFetusSectionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetusSectionOperations.validateFetusSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSectionSubject(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetusSectionOperations.validateFetusSectionSubject(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSectionAbnormalConditionsoftheNewborn(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetusSectionOperations.validateFetusSectionAbnormalConditionsoftheNewborn(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSectionBirthOrder(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetusSectionOperations.validateFetusSectionBirthOrder(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSectionNumberofInfantsBornAlive(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetusSectionOperations.validateFetusSectionNumberofInfantsBornAlive(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSectionCongenitalAnomaliesoftheNewborn2(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetusSectionOperations.validateFetusSectionCongenitalAnomaliesoftheNewborn2(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetusSectionWeight(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetusSectionOperations.validateFetusSectionWeight(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbnormalConditionsoftheNewborn> getAbnormalConditionsoftheNewborns()
  {
    return FetusSectionOperations.getAbnormalConditionsoftheNewborns(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BirthOrder getBirthOrder()
  {
    return FetusSectionOperations.getBirthOrder(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberofInfantsBornAlive getNumberofInfantsBornAlive()
  {
    return FetusSectionOperations.getNumberofInfantsBornAlive(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CongenitalAnomaliesoftheNewborn> getCongenitalAnomaliesoftheNewborn2s()
  {
    return FetusSectionOperations.getCongenitalAnomaliesoftheNewborn2s(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Weight getWeight()
  {
    return FetusSectionOperations.getWeight(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetusSection init() {
    	CDAUtil.init(this);
    	return this;
  }
} //FetusSectionImpl
