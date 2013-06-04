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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSSituationSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Situation Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSSituationSectionImpl extends SectionImpl implements EMSSituationSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected EMSSituationSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_SITUATION_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSSituationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSSituationSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSSituationSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSSituationSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSSituationSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSSituationSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionEntry1(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSSituationSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionEntry3(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSSituationSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionEntry4(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSSituationSectionEntry5(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionEntry5(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSSituationSectionEntry6(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionEntry6(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSSituationSectionEntry7(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionEntry7(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSSituationSectionEntry8(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionEntry8(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSSituationSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSituationSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSSituationSectionImpl
