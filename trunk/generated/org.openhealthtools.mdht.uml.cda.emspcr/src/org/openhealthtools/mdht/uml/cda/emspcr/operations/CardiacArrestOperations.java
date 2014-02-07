/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Arrest</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestCauseRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestInformantParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Informant Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestPriorCPRRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Prior CPR Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestPriorAEDRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Prior AED Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestSpontaneousCirculationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Spontaneous Circulation Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestDestinationRhythmRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Destination Rhythm Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestArrestRhythmRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Arrest Rhythm Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardiacArrestOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardiacArrestOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestCauseRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCauseRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestCauseRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCauseRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestCauseRelationship(CardiacArrest cardiacArrest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_CAUSE_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestCauseRelationship"), new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestInformantParticipation(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Informant Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestInformantParticipation(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->one(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestInformantParticipation(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Informant Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestInformantParticipation(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestInformantParticipation(CardiacArrest cardiacArrest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_INFORMANT_PARTICIPATION,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestInformantParticipation"),
					new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestPriorCPRRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Prior CPR Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestPriorCPRRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestPriorCPRRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Prior CPR Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestPriorCPRRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestPriorCPRRelationship(CardiacArrest cardiacArrest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_PRIOR_CPR_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestPriorCPRRelationship"),
					new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestPriorAEDRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Prior AED Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestPriorAEDRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestPriorAEDRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Prior AED Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestPriorAEDRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestPriorAEDRelationship(CardiacArrest cardiacArrest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_PRIOR_AED_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestPriorAEDRelationship"),
					new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestSpontaneousCirculationRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Spontaneous Circulation Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestSpontaneousCirculationRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestSpontaneousCirculationRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Spontaneous Circulation Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestSpontaneousCirculationRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestSpontaneousCirculationRelationship(CardiacArrest cardiacArrest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CARDIAC_ARREST_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_SPONTANEOUS_CIRCULATION_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestSpontaneousCirculationRelationship"),
					new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestDestinationRhythmRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Destination Rhythm Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestDestinationRhythmRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestDestinationRhythmRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Destination Rhythm Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestDestinationRhythmRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestDestinationRhythmRelationship(CardiacArrest cardiacArrest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CARDIAC_ARREST_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_DESTINATION_RHYTHM_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestDestinationRhythmRelationship"),
					new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestArrestRhythmRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Arrest Rhythm Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestArrestRhythmRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestArrestRhythmRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Arrest Rhythm Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestArrestRhythmRelationship(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestArrestRhythmRelationship(CardiacArrest cardiacArrest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_ARREST_RHYTHM_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestArrestRhythmRelationship"),
					new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestTemplateId(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestTemplateId(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.27')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestTemplateId(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestTemplateId(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestTemplateId(CardiacArrest cardiacArrest, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestTemplateId"), new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestMoodCode(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestMoodCode(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestMoodCode(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestMoodCode(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestMoodCode(CardiacArrest cardiacArrest, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestMoodCode"), new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestCode(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCode(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestCode(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCode(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestCode(CardiacArrest cardiacArrest, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_CODE,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestCode"), new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestNegationInd(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestNegationInd(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestNegationInd(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestNegationInd(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestNegationInd(CardiacArrest cardiacArrest, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_NEGATION_IND,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestNegationInd"), new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestEffectiveTime(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestEffectiveTime(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestEffectiveTime(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestEffectiveTime(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestEffectiveTime(CardiacArrest cardiacArrest, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_EFFECTIVE_TIME,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestEffectiveTime"), new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestValue(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestValue(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.code = '410429000' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestValue(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestValue(CardiacArrest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrest The receiving '<em><b>Cardiac Arrest</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestValue(CardiacArrest cardiacArrest, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST);
			try {
				VALIDATE_CARDIAC_ARREST_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrest)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST__CARDIAC_ARREST_VALUE,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestValue"), new Object[] { cardiacArrest }));
			}

			return false;
		}
		return true;
	}

} // CardiacArrestOperations
