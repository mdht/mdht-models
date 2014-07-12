/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.DeathDiagnosisOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Death Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeathDiagnosisImpl extends ObservationImpl implements DeathDiagnosis
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeathDiagnosisImpl()
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
    return SdtmPackage.Literals.DEATH_DIAGNOSIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisDeathDiagnosisResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisDeathDiagnosisResultCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return DeathDiagnosisOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathDiagnosis init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeathDiagnosis init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //DeathDiagnosisImpl
