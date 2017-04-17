/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesPositive;
import org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesRemovedandExamined;
import org.openhealthtools.mdht.uml.cda.clondata.operations.LymphNodeSamplingResultOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ResultOrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lymph Node Sampling Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LymphNodeSamplingResultOrganizerImpl extends ResultOrganizerImpl
		implements LymphNodeSamplingResultOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LymphNodeSamplingResultOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizerClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LymphNodeSamplingResultOrganizerOperations.validateLymphNodeSamplingResultOrganizerClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizerCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LymphNodeSamplingResultOrganizerOperations.validateLymphNodeSamplingResultOrganizerCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizerEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LymphNodeSamplingResultOrganizerOperations.validateLymphNodeSamplingResultOrganizerEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizerStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LymphNodeSamplingResultOrganizerOperations.validateLymphNodeSamplingResultOrganizerStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizerStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LymphNodeSamplingResultOrganizerOperations.validateLymphNodeSamplingResultOrganizerStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LymphNodeSamplingResultOrganizerOperations.validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LymphNodeSamplingResultOrganizerOperations.validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LymphNodeSamplingResultOrganizerOperations.validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LymphNodeSamplingResultOrganizerOperations.validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LymphNodeSamplingResultOrganizerOperations.validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LymphNodeSamplingResultOrganizerOperations.validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberofLymphNodesRemovedandExamined getNumberofLymphNodesRemovedandExamined() {
		return LymphNodeSamplingResultOrganizerOperations.getNumberofLymphNodesRemovedandExamined(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberofLymphNodesPositive getNumberofLymphNodesPositive() {
		return LymphNodeSamplingResultOrganizerOperations.getNumberofLymphNodesPositive(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LymphNodeSamplingResultOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LymphNodeSamplingResultOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LymphNodeSamplingResultOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // LymphNodeSamplingResultOrganizerImpl
