/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EncountersActivites;
import org.openhealthtools.mdht.uml.cda.consol.Indication;

import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Activites</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesHasIndications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Has Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesHasPractitioners(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Has Practitioners</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesPractitionerRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Practitioner Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#getServiceDeliveryLocations() <em>Get Service Delivery Locations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#getIndication() <em>Get Indication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncountersActivitesOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncountersActivitesOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersActivitesHasIndications(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Has Indications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesHasIndications(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_ACTIVITES_HAS_INDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(er : cda::EntryRelationship | er.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersActivitesHasIndications(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Has Indications</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesHasIndications(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_ACTIVITES_HAS_INDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(er : cda::EntryRelationship | er.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param encountersActivites The receiving '<em><b>Encounters Activites</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersActivitesHasIndications(EncountersActivites encountersActivites,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_ACTIVITES_HAS_INDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_ACTIVITES);
			try {
				VALIDATE_ENCOUNTERS_ACTIVITES_HAS_INDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_ACTIVITES_HAS_INDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_ACTIVITES_HAS_INDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivites)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTERS_ACTIVITES__ENCOUNTERS_ACTIVITES_HAS_INDICATIONS,
						 ConsolPlugin.INSTANCE.getString("EncountersActivitesHasIndications"),
						 new Object [] { encountersActivites }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersActivitesHasPractitioners(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Has Practitioners</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesHasPractitioners(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_ACTIVITES_HAS_PRACTITIONERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->size() >= 0";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersActivitesHasPractitioners(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Has Practitioners</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesHasPractitioners(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_ACTIVITES_HAS_PRACTITIONERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->size() >= 0
	 * @param encountersActivites The receiving '<em><b>Encounters Activites</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersActivitesHasPractitioners(EncountersActivites encountersActivites,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_ACTIVITES_HAS_PRACTITIONERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_ACTIVITES);
			try {
				VALIDATE_ENCOUNTERS_ACTIVITES_HAS_PRACTITIONERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_ACTIVITES_HAS_PRACTITIONERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_ACTIVITES_HAS_PRACTITIONERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivites)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTERS_ACTIVITES__ENCOUNTERS_ACTIVITES_HAS_PRACTITIONERS,
						 ConsolPlugin.INSTANCE.getString("EncountersActivitesHasPractitioners"),
						 new Object [] { encountersActivites }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersActivitesPractitionerRole(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Practitioner Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesPractitionerRole(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_ACTIVITES_PRACTITIONER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer.assignedEntity.code->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersActivitesPractitionerRole(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Practitioner Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesPractitionerRole(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_ACTIVITES_PRACTITIONER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer.assignedEntity.code->size() = 1
	 * @param encountersActivites The receiving '<em><b>Encounters Activites</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersActivitesPractitionerRole(EncountersActivites encountersActivites,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_ACTIVITES_PRACTITIONER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_ACTIVITES);
			try {
				VALIDATE_ENCOUNTERS_ACTIVITES_PRACTITIONER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_ACTIVITES_PRACTITIONER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_ACTIVITES_PRACTITIONER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivites)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTERS_ACTIVITES__ENCOUNTERS_ACTIVITES_PRACTITIONER_ROLE,
						 ConsolPlugin.INSTANCE.getString("EncountersActivitesPractitionerRole"),
						 new Object [] { encountersActivites }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersActivitesTemplateId(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesTemplateId(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_ACTIVITES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.21')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersActivitesTemplateId(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesTemplateId(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_ACTIVITES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.21')
	 * @param encountersActivites The receiving '<em><b>Encounters Activites</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersActivitesTemplateId(EncountersActivites encountersActivites,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_ACTIVITES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_ACTIVITES);
			try {
				VALIDATE_ENCOUNTERS_ACTIVITES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_ACTIVITES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_ACTIVITES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivites)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTERS_ACTIVITES__ENCOUNTERS_ACTIVITES_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("EncountersActivitesTemplateId"),
						 new Object [] { encountersActivites }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersActivitesClassCode(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesClassCode(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_ACTIVITES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::ENC";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersActivitesClassCode(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesClassCode(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_ACTIVITES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClass::ENC
	 * @param encountersActivites The receiving '<em><b>Encounters Activites</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersActivitesClassCode(EncountersActivites encountersActivites,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_ACTIVITES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_ACTIVITES);
			try {
				VALIDATE_ENCOUNTERS_ACTIVITES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_ACTIVITES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_ACTIVITES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivites)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTERS_ACTIVITES__ENCOUNTERS_ACTIVITES_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("EncountersActivitesClassCode"),
						 new Object [] { encountersActivites }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersActivitesMoodCode(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesMoodCode(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_ACTIVITES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentEncounterMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersActivitesMoodCode(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesMoodCode(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_ACTIVITES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentEncounterMood::EVN
	 * @param encountersActivites The receiving '<em><b>Encounters Activites</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersActivitesMoodCode(EncountersActivites encountersActivites,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_ACTIVITES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_ACTIVITES);
			try {
				VALIDATE_ENCOUNTERS_ACTIVITES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_ACTIVITES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_ACTIVITES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivites)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTERS_ACTIVITES__ENCOUNTERS_ACTIVITES_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("EncountersActivitesMoodCode"),
						 new Object [] { encountersActivites }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersActivitesId(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesId(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_ACTIVITES_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersActivitesId(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesId(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_ACTIVITES_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param encountersActivites The receiving '<em><b>Encounters Activites</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersActivitesId(EncountersActivites encountersActivites,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_ACTIVITES_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_ACTIVITES);
			try {
				VALIDATE_ENCOUNTERS_ACTIVITES_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_ACTIVITES_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_ACTIVITES_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivites)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTERS_ACTIVITES__ENCOUNTERS_ACTIVITES_ID,
						 ConsolPlugin.INSTANCE.getString("EncountersActivitesId"),
						 new Object [] { encountersActivites }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersActivitesEffectiveTime(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesEffectiveTime(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_ACTIVITES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersActivitesEffectiveTime(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesEffectiveTime(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_ACTIVITES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param encountersActivites The receiving '<em><b>Encounters Activites</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersActivitesEffectiveTime(EncountersActivites encountersActivites,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_ACTIVITES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_ACTIVITES);
			try {
				VALIDATE_ENCOUNTERS_ACTIVITES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_ACTIVITES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_ACTIVITES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivites)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTERS_ACTIVITES__ENCOUNTERS_ACTIVITES_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("EncountersActivitesEffectiveTime"),
						 new Object [] { encountersActivites }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersActivitesServiceDeliveryLocation(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Service Delivery Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesServiceDeliveryLocation(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_ACTIVITES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ServiceDeliveryLocation))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersActivitesServiceDeliveryLocation(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Service Delivery Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesServiceDeliveryLocation(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_ACTIVITES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ServiceDeliveryLocation))
	 * @param encountersActivites The receiving '<em><b>Encounters Activites</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersActivitesServiceDeliveryLocation(EncountersActivites encountersActivites,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_ACTIVITES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_ACTIVITES);
			try {
				VALIDATE_ENCOUNTERS_ACTIVITES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_ACTIVITES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_ACTIVITES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivites)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTERS_ACTIVITES__ENCOUNTERS_ACTIVITES_SERVICE_DELIVERY_LOCATION,
						 ConsolPlugin.INSTANCE.getString("EncountersActivitesServiceDeliveryLocation"),
						 new Object [] { encountersActivites }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersActivitesIndication(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesIndication(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_ACTIVITES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersActivitesIndication(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersActivitesIndication(EncountersActivites, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_ACTIVITES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication))
	 * @param encountersActivites The receiving '<em><b>Encounters Activites</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersActivitesIndication(EncountersActivites encountersActivites,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_ACTIVITES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_ACTIVITES);
			try {
				VALIDATE_ENCOUNTERS_ACTIVITES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_ACTIVITES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_ACTIVITES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivites)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTERS_ACTIVITES__ENCOUNTERS_ACTIVITES_INDICATION,
						 ConsolPlugin.INSTANCE.getString("EncountersActivitesIndication"),
						 new Object [] { encountersActivites }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getServiceDeliveryLocations(EncountersActivites) <em>Get Service Delivery Locations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryLocations(EncountersActivites)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SERVICE_DELIVERY_LOCATIONS__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ServiceDeliveryLocation)).oclAsType(consol::ServiceDeliveryLocation)";

	/**
	 * The cached OCL query for the '{@link #getServiceDeliveryLocations(EncountersActivites) <em>Get Service Delivery Locations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryLocations(EncountersActivites)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ServiceDeliveryLocation)).oclAsType(consol::ServiceDeliveryLocation)
	 * @param encountersActivites The receiving '<em><b>Encounters Activites</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ServiceDeliveryLocation> getServiceDeliveryLocations(EncountersActivites encountersActivites) {
		if (GET_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.ENCOUNTERS_ACTIVITES, ConsolPackage.Literals.ENCOUNTERS_ACTIVITES.getEAllOperations().get(59));
			try {
				GET_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY = helper.createQuery(GET_SERVICE_DELIVERY_LOCATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ServiceDeliveryLocation> result = (Collection<ServiceDeliveryLocation>) query.evaluate(encountersActivites);
		return new BasicEList.UnmodifiableEList<ServiceDeliveryLocation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndication(EncountersActivites) <em>Get Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication(EncountersActivites)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication))->asSequence()->first().oclAsType(consol::Indication)";

	/**
	 * The cached OCL query for the '{@link #getIndication(EncountersActivites) <em>Get Indication</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication(EncountersActivites)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication))->asSequence()->first().oclAsType(consol::Indication)
	 * @param encountersActivites The receiving '<em><b>Encounters Activites</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Indication getIndication(EncountersActivites encountersActivites) {
		if (GET_INDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.ENCOUNTERS_ACTIVITES, ConsolPackage.Literals.ENCOUNTERS_ACTIVITES.getEAllOperations().get(60));
			try {
				GET_INDICATION__EOCL_QRY = helper.createQuery(GET_INDICATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INDICATION__EOCL_QRY);
		return (Indication) query.evaluate(encountersActivites);
	}

} // EncountersActivitesOperations
