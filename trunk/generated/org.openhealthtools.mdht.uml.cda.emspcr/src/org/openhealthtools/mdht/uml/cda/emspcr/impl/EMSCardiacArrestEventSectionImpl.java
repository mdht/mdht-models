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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSCardiacArrestEventSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Cardiac Arrest Event Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSCardiacArrestEventSectionImpl extends SectionImpl implements EMSCardiacArrestEventSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSCardiacArrestEventSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCardiacArrestEventSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCardiacArrestEventSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCardiacArrestEventSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCardiacArrestEventSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCardiacArrestEventSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionEntry1(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSCardiacArrestEventSection init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public EMSCardiacArrestEventSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSCardiacArrestEventSectionImpl
