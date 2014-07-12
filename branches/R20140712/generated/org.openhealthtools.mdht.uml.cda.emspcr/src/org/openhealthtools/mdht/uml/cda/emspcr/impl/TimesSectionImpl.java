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

import org.openhealthtools.mdht.uml.cda.emspcr.CallTime;
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime;
import org.openhealthtools.mdht.uml.cda.emspcr.TimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.TimesSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Times Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TimesSectionImpl extends SectionImpl implements TimesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.TIMES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionCallTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionCallTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionUnitNotifiedTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionUnitNotifiedTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionUnitEnRouteTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionUnitEnRouteTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionUnitOnSceneTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionUnitOnSceneTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionUnitAtPatienttTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionUnitAtPatienttTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionUnitLeftSceneTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionUnitLeftSceneTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionPatientArrivedAtDestinationTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionPatientArrivedAtDestinationTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionUnitBackInServiceTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionUnitBackInServiceTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimesSectionDispatchNotifiedTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimesSectionOperations.validateTimesSectionDispatchNotifiedTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTime getCallTime() {
		return TimesSectionOperations.getCallTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitNotifiedTime getUnitNotifiedTime() {
		return TimesSectionOperations.getUnitNotifiedTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitEnRouteTime getUnitEnRouteTime() {
		return TimesSectionOperations.getUnitEnRouteTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOnSceneTime getUnitOnSceneTime() {
		return TimesSectionOperations.getUnitOnSceneTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAtPatientTime getUnitAtPatienttTime() {
		return TimesSectionOperations.getUnitAtPatienttTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitLeftSceneTime getUnitLeftSceneTime() {
		return TimesSectionOperations.getUnitLeftSceneTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientArrivedAtDestinationTime getPatientArrivedAtDestinationTime() {
		return TimesSectionOperations.getPatientArrivedAtDestinationTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitBackInServiceTime getUnitBackInServiceTime() {
		return TimesSectionOperations.getUnitBackInServiceTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchNotifiedTime getDispatchNotifiedTime() {
		return TimesSectionOperations.getDispatchNotifiedTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimesSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimesSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // TimesSectionImpl
