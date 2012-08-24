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

import org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.ProtocolDeviationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Deviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProtocolDeviationImpl extends ObservationImpl implements ProtocolDeviation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProtocolDeviationImpl()
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
    return SdtmPackage.Literals.PROTOCOL_DEVIATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationProtocolDeviationCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationProtocolDeviationCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationProtocolDeviationSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationProtocolDeviationSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationStudyEpoch(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationStudyEpoch(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationprotocolDeviationCategoryAssociationProtocolDeviationCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationProtocolDeviationCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationProtocolDeviationSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationSubCategoryAssociationProtocolDeviationSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyEpoch getStudyEpoch()
  {
    return ProtocolDeviationOperations.getStudyEpoch(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolDeviation init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProtocolDeviation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ProtocolDeviationImpl
