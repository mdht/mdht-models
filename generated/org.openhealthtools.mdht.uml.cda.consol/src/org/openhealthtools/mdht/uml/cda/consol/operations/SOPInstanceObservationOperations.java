/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation;
import org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation;
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>SOP Instance Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationSOPInstanceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationPurposeofReferenceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Purposeof Reference Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationReferencedFramesObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Referenced Frames Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#getSOPInstanceObservation() <em>Get SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#getPurposeofReferenceObservation() <em>Get Purposeof Reference Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#getReferencedFramesObservation() <em>Get Referenced Frames Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SOPInstanceObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SOPInstanceObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationTemplateId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationTemplateId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationTemplateId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationTemplateId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.8')
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSOPInstanceObservationTemplateId(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationTemplateId"),
						 new Object [] { sopInstanceObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationClassCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationClassCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::DGIMG";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationClassCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationClassCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::DGIMG
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSOPInstanceObservationClassCode(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationClassCode"),
						 new Object [] { sopInstanceObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationEffectiveTime(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEffectiveTime(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationEffectiveTime(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEffectiveTime(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSOPInstanceObservationEffectiveTime(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationEffectiveTime"),
						 new Object [] { sopInstanceObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSOPInstanceObservationId(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_ID,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationId"),
						 new Object [] { sopInstanceObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationMoodCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationMoodCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationMoodCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationMoodCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSOPInstanceObservationMoodCode(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationMoodCode"),
						 new Object [] { sopInstanceObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationText(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationText(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationText(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationText(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSOPInstanceObservationText(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_TEXT,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationText"),
						 new Object [] { sopInstanceObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationSOPInstanceObservation(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation SOP Instance Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationSOPInstanceObservation(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SOPInstanceObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationSOPInstanceObservation(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation SOP Instance Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationSOPInstanceObservation(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SOPInstanceObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSOPInstanceObservationSOPInstanceObservation(
			SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservation"),
						 new Object [] { sopInstanceObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationPurposeofReferenceObservation(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Purposeof Reference Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationPurposeofReferenceObservation(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PurposeofReferenceObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationPurposeofReferenceObservation(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Purposeof Reference Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationPurposeofReferenceObservation(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PurposeofReferenceObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSOPInstanceObservationPurposeofReferenceObservation(
			SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationPurposeofReferenceObservation"),
						 new Object [] { sopInstanceObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationReferencedFramesObservation(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Referenced Frames Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationReferencedFramesObservation(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReferencedFramesObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationReferencedFramesObservation(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Referenced Frames Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationReferencedFramesObservation(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReferencedFramesObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSOPInstanceObservationReferencedFramesObservation(
			SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationReferencedFramesObservation"),
						 new Object [] { sopInstanceObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSOPInstanceObservation(SOPInstanceObservation) <em>Get SOP Instance Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOPInstanceObservation(SOPInstanceObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOP_INSTANCE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SOPInstanceObservation))->asSequence()->first().oclAsType(consol::SOPInstanceObservation)";

	/**
	 * The cached OCL query for the '{@link #getSOPInstanceObservation(SOPInstanceObservation) <em>Get SOP Instance Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOPInstanceObservation(SOPInstanceObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOP_INSTANCE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SOPInstanceObservation))->asSequence()->first().oclAsType(consol::SOPInstanceObservation)
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SOPInstanceObservation getSOPInstanceObservation(SOPInstanceObservation sopInstanceObservation) {
		if (GET_SOP_INSTANCE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION, ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION.getEAllOperations().get(58));
			try {
				GET_SOP_INSTANCE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_SOP_INSTANCE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOP_INSTANCE_OBSERVATION__EOCL_QRY);
		return (SOPInstanceObservation) query.evaluate(sopInstanceObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPurposeofReferenceObservation(SOPInstanceObservation) <em>Get Purposeof Reference Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeofReferenceObservation(SOPInstanceObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PURPOSEOF_REFERENCE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PurposeofReferenceObservation))->asSequence()->first().oclAsType(consol::PurposeofReferenceObservation)";

	/**
	 * The cached OCL query for the '{@link #getPurposeofReferenceObservation(SOPInstanceObservation) <em>Get Purposeof Reference Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeofReferenceObservation(SOPInstanceObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PURPOSEOF_REFERENCE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PurposeofReferenceObservation))->asSequence()->first().oclAsType(consol::PurposeofReferenceObservation)
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PurposeofReferenceObservation getPurposeofReferenceObservation(
			SOPInstanceObservation sopInstanceObservation) {
		if (GET_PURPOSEOF_REFERENCE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION, ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION.getEAllOperations().get(59));
			try {
				GET_PURPOSEOF_REFERENCE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PURPOSEOF_REFERENCE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PURPOSEOF_REFERENCE_OBSERVATION__EOCL_QRY);
		return (PurposeofReferenceObservation) query.evaluate(sopInstanceObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReferencedFramesObservation(SOPInstanceObservation) <em>Get Referenced Frames Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedFramesObservation(SOPInstanceObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REFERENCED_FRAMES_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReferencedFramesObservation))->asSequence()->first().oclAsType(consol::ReferencedFramesObservation)";

	/**
	 * The cached OCL query for the '{@link #getReferencedFramesObservation(SOPInstanceObservation) <em>Get Referenced Frames Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedFramesObservation(SOPInstanceObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REFERENCED_FRAMES_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReferencedFramesObservation))->asSequence()->first().oclAsType(consol::ReferencedFramesObservation)
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ReferencedFramesObservation getReferencedFramesObservation(
			SOPInstanceObservation sopInstanceObservation) {
		if (GET_REFERENCED_FRAMES_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION, ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION.getEAllOperations().get(60));
			try {
				GET_REFERENCED_FRAMES_OBSERVATION__EOCL_QRY = helper.createQuery(GET_REFERENCED_FRAMES_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REFERENCED_FRAMES_OBSERVATION__EOCL_QRY);
		return (ReferencedFramesObservation) query.evaluate(sopInstanceObservation);
	}

} // SOPInstanceObservationOperations
