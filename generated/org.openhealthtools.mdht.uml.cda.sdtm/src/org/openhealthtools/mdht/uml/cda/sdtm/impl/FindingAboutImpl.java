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

import org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.FindingAboutOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finding About</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FindingAboutImpl extends ObservationImpl implements FindingAbout
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FindingAboutImpl()
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
    return SdtmPackage.Literals.FINDING_ABOUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutTargetSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutFindingObservationObjectAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutFindingObservationObjectAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutFindingAboutCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutFindingAboutCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutFindingAboutSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutFindingAboutSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutBaselineIndicator(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutBaselineIndicator(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingObservationObjectAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingObservationObjectAssociationObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationObservation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCodeFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCodeFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodePFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodePFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCodeFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCodeFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValueFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValueFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingAboutCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingAboutCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFindingAboutfindingAboutSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FindingAboutOperations.validateFindingAboutfindingAboutSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return FindingAboutOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return FindingAboutOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaselineIndicator getBaselineIndicator()
  {
    return FindingAboutOperations.getBaselineIndicator(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return FindingAboutOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FindingAbout init() {
    	CDAUtil.init(this);
    	return this;
  }
} //FindingAboutImpl
