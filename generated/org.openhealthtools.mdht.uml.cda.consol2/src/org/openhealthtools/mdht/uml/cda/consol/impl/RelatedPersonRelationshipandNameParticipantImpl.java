/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.Participant1Impl;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant;

import org.openhealthtools.mdht.uml.cda.consol.operations.RelatedPersonRelationshipandNameParticipantOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Person Relationshipand Name Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RelatedPersonRelationshipandNameParticipantImpl extends Participant1Impl
		implements RelatedPersonRelationshipandNameParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedPersonRelationshipandNameParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedPersonRelationshipandNameParticipantTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedPersonRelationshipandNameParticipantTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPersonRelationshipandNameParticipant init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPersonRelationshipandNameParticipant init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // RelatedPersonRelationshipandNameParticipantImpl
