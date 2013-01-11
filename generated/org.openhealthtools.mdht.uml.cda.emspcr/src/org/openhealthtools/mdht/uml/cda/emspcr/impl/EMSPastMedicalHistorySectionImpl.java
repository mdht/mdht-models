/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPastMedicalHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Past Medical History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSPastMedicalHistorySectionImpl extends SectionImpl implements EMSPastMedicalHistorySection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EMSPastMedicalHistorySectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSPastMedicalHistorySectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSPastMedicalHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSPastMedicalHistorySectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSPastMedicalHistorySectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionTitle(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSPastMedicalHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionText(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSPastMedicalHistorySectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionEntry1(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSPastMedicalHistorySectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionEntry2(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void getEntry1()
  {
    EMSPastMedicalHistorySectionOperations.getEntry1(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void getEntry2()
  {
    EMSPastMedicalHistorySectionOperations.getEntry2(this);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSPastMedicalHistorySection init() {
    	CDAUtil.init(this);
    	return this;
  }
} // EMSPastMedicalHistorySectionImpl
