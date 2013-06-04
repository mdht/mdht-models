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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPersonnelAdverseEventSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Personnel Adverse Event Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSPersonnelAdverseEventSectionImpl extends SectionImpl implements EMSPersonnelAdverseEventSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected EMSPersonnelAdverseEventSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSPersonnelAdverseEventSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSPersonnelAdverseEventSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSPersonnelAdverseEventSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSPersonnelAdverseEventSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSPersonnelAdverseEventSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionTitle(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSPersonnelAdverseEventSectionEntry1(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionEntry1(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSPersonnelAdverseEventSectionEntry2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPersonnelAdverseEventSectionOperations.validateEMSPersonnelAdverseEventSectionEntry2(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSPersonnelAdverseEventSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPersonnelAdverseEventSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSPersonnelAdverseEventSectionImpl
