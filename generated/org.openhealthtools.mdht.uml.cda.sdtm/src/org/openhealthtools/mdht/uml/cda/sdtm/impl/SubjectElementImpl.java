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

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubjectElementOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubjectElementImpl extends ActImpl implements SubjectElement
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubjectElementImpl()
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
    return SdtmPackage.Literals.SUBJECT_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementStudyEpoch(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementStudyEpoch(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementElementOrderAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementElementOrderAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementelementOrderAssociationelementOrderClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementelementOrderAssociationelementOrderCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementelementOrderAssociationelementOrderCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementelementOrderAssociationelementOrderMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementelementOrderAssociationelementOrderValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementelementOrderAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementelementOrderAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementelementOrderAssociationElementOrder(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementelementOrderAssociationElementOrder(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyEpoch getStudyEpoch()
  {
    return SubjectElementOperations.getStudyEpoch(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectElement init() {
    	CDAUtil.init(this);
    	return this;
  }
} //SubjectElementImpl
