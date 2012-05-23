/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

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
  public boolean validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(this, diagnostics, context);
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
    	CDAUtil.init(this);
    	return this;
  }
} //ProtocolDeviationImpl
