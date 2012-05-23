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

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.NonHumanSubjectDataDocumentBody;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonHumanSubjectDataDocumentBodyOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Human Subject Data Document Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonHumanSubjectDataDocumentBodyImpl extends SectionImpl implements NonHumanSubjectDataDocumentBody
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonHumanSubjectDataDocumentBodyImpl()
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
    return SdtmPackage.Literals.NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanSubjectDataDocumentBodyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanSubjectDataDocumentBodyOperations.validateNonHumanSubjectDataDocumentBodyTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanSubjectDataDocumentBodyClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanSubjectDataDocumentBodyOperations.validateNonHumanSubjectDataDocumentBodyClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanSubjectDataDocumentBodyCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanSubjectDataDocumentBodyOperations.validateNonHumanSubjectDataDocumentBodyCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanSubjectDataDocumentBodyCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanSubjectDataDocumentBodyOperations.validateNonHumanSubjectDataDocumentBodyCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanSubjectDataDocumentBodyMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanSubjectDataDocumentBodyOperations.validateNonHumanSubjectDataDocumentBodyMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonHumanSubjectDataDocumentBody init() {
    	CDAUtil.init(this);
    	return this;
  }
} //NonHumanSubjectDataDocumentBodyImpl
