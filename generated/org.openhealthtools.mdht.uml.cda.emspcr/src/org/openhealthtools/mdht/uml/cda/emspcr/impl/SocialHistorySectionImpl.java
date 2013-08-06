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

import org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication;
import org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.SocialHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SocialHistorySectionImpl extends SectionImpl implements SocialHistorySection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected SocialHistorySectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.SOCIAL_HISTORY_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionExistenceOfDrugUseIndication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionExistenceOfDrugUseIndication(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionDrugUseIndication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionDrugUseIndication(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ExistenceOfDrugUseIndication getExistenceOfDrugUseIndication() {
		return SocialHistorySectionOperations.getExistenceOfDrugUseIndication(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public DrugUseIndication getDrugUseIndication() {
		return SocialHistorySectionOperations.getDrugUseIndication(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public SocialHistorySection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SocialHistorySectionImpl
