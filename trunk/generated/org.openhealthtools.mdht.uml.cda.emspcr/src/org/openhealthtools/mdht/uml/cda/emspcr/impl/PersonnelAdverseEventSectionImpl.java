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

import org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PersonnelAdverseEventSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personnel Adverse Event Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PersonnelAdverseEventSectionImpl extends SectionImpl implements PersonnelAdverseEventSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonnelAdverseEventSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PERSONNEL_ADVERSE_EVENT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonnelAdverseEventSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonnelAdverseEventSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonnelAdverseEventSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonnelAdverseEventSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonnelAdverseEventSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonnelAdverseEventSectionAdverseEventIndicator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionAdverseEventIndicator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonnelAdverseEventSectionAdverseEventTypeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionAdverseEventTypeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventIndicator getAdverseEventIndicator() {
		return PersonnelAdverseEventSectionOperations.getAdverseEventIndicator(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventTypeObservation getAdverseEventTypeObservation() {
		return PersonnelAdverseEventSectionOperations.getAdverseEventTypeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonnelAdverseEventSection init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersonnelAdverseEventSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PersonnelAdverseEventSectionImpl
