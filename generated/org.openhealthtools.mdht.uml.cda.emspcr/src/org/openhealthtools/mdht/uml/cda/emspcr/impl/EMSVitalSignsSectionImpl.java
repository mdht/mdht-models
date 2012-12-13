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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSVitalSignsSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Vital Signs Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSVitalSignsSectionImpl extends SectionImpl implements EMSVitalSignsSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected EMSVitalSignsSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_VITAL_SIGNS_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSVitalSignsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSVitalSignsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSVitalSignsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSVitalSignsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSVitalSignsSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionEntry1(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSVitalSignsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSVitalSignsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSVitalSignsSectionImpl
