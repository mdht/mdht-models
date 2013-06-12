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

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Arrest Existence</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceCardiacArrestCauseRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Cardiac Arrest Cause Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceCardiacArrestInformantParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Cardiac Arrest Informant Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistencePriorCPRRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Prior CPR Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistencePriorAEDRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Prior AED Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceSpontaneousCirculationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Spontaneous Circulation Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceDestinationRhythmRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Destination Rhythm Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceArrestRhythmRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Arrest Rhythm Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardiacArrestExistenceOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardiacArrestExistenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistenceCardiacArrestCauseRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Cardiac Arrest Cause Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceCardiacArrestCauseRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistenceCardiacArrestCauseRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Cardiac Arrest Cause Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceCardiacArrestCauseRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistenceCardiacArrestCauseRelationship(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_CAUSE_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistenceCardiacArrestCauseRelationship"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistenceCardiacArrestInformantParticipation(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Cardiac Arrest Informant Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceCardiacArrestInformantParticipation(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->one(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistenceCardiacArrestInformantParticipation(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Cardiac Arrest Informant Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceCardiacArrestInformantParticipation(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistenceCardiacArrestInformantParticipation(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_INFORMANT_PARTICIPATION,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistenceCardiacArrestInformantParticipation"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistencePriorCPRRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Prior CPR Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistencePriorCPRRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistencePriorCPRRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Prior CPR Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistencePriorCPRRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistencePriorCPRRelationship(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_PRIOR_CPR_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistencePriorCPRRelationship"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistencePriorAEDRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Prior AED Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistencePriorAEDRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistencePriorAEDRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Prior AED Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistencePriorAEDRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistencePriorAEDRelationship(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_PRIOR_AED_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistencePriorAEDRelationship"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistenceSpontaneousCirculationRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Spontaneous Circulation Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceSpontaneousCirculationRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistenceSpontaneousCirculationRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Spontaneous Circulation Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceSpontaneousCirculationRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistenceSpontaneousCirculationRelationship(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_SPONTANEOUS_CIRCULATION_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistenceSpontaneousCirculationRelationship"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistenceDestinationRhythmRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Destination Rhythm Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceDestinationRhythmRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistenceDestinationRhythmRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Destination Rhythm Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceDestinationRhythmRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistenceDestinationRhythmRelationship(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_DESTINATION_RHYTHM_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistenceDestinationRhythmRelationship"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistenceArrestRhythmRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Arrest Rhythm Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceArrestRhythmRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistenceArrestRhythmRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Arrest Rhythm Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceArrestRhythmRelationship(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistenceArrestRhythmRelationship(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_ARREST_RHYTHM_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistenceArrestRhythmRelationship"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistenceTemplateId(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceTemplateId(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.27')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistenceTemplateId(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceTemplateId(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistenceTemplateId(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistenceTemplateId"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistenceCode(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceCode(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistenceCode(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceCode(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistenceCode(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_CODE,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistenceCode"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistenceEffectiveTime(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceEffectiveTime(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistenceEffectiveTime(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceEffectiveTime(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistenceEffectiveTime(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistenceEffectiveTime"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistenceValue(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceValue(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.code = '410429000' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistenceValue(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceValue(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistenceValue(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistenceValue"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistenceNegationInd(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceNegationInd(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistenceNegationInd(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceNegationInd(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistenceNegationInd(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_NEGATION_IND,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistenceNegationInd"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestExistenceMoodCode(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceMoodCode(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_EXISTENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestExistenceMoodCode(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestExistenceMoodCode(CardiacArrestExistence, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CARDIAC_ARREST_EXISTENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestExistence The receiving '<em><b>Cardiac Arrest Existence</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCardiacArrestExistenceMoodCode(CardiacArrestExistence cardiacArrestExistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CARDIAC_ARREST_EXISTENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE);
			try {
				VALIDATE_CARDIAC_ARREST_EXISTENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_EXISTENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_EXISTENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cardiacArrestExistence)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_EXISTENCE__CARDIAC_ARREST_EXISTENCE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestExistenceMoodCode"),
						 new Object [] { cardiacArrestExistence }));
			}
			 
			return false;
		}
		return true;
	}

} // CardiacArrestExistenceOperations