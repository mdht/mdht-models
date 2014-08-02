/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Supplemental Value</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue#validateSupplementalValueTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue#validateSupplementalValueClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue#validateSupplementalValueMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue#validateSupplementalValueCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue#validateSupplementalValueCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue#validateSupplementalValueValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue#validateSupplementalValueOrigenAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Origen Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue#validateSupplementalValueStudyFindingEvaluator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Study Finding Evaluator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplementalValueOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplementalValueOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplementalValueTemplateId(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueTemplateId(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLEMENTAL_VALUE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplementalValueTemplateId(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueTemplateId(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUPPLEMENTAL_VALUE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplementalValue The receiving '<em><b>Supplemental Value</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSupplementalValueTemplateId(SupplementalValue supplementalValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUPPLEMENTAL_VALUE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUPPLEMENTAL_VALUE);
			try {
				VALIDATE_SUPPLEMENTAL_VALUE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLEMENTAL_VALUE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLEMENTAL_VALUE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplementalValue)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUPPLEMENTAL_VALUE__SUPPLEMENTAL_VALUE_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SupplementalValueTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(supplementalValue, context) }),
						 new Object [] { supplementalValue }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplementalValueClassCode(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueClassCode(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLEMENTAL_VALUE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplementalValueClassCode(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueClassCode(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUPPLEMENTAL_VALUE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplementalValue The receiving '<em><b>Supplemental Value</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSupplementalValueClassCode(SupplementalValue supplementalValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUPPLEMENTAL_VALUE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUPPLEMENTAL_VALUE);
			try {
				VALIDATE_SUPPLEMENTAL_VALUE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLEMENTAL_VALUE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLEMENTAL_VALUE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplementalValue)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUPPLEMENTAL_VALUE__SUPPLEMENTAL_VALUE_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SupplementalValueClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(supplementalValue, context) }),
						 new Object [] { supplementalValue }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplementalValueMoodCode(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueMoodCode(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLEMENTAL_VALUE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplementalValueMoodCode(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueMoodCode(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUPPLEMENTAL_VALUE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplementalValue The receiving '<em><b>Supplemental Value</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSupplementalValueMoodCode(SupplementalValue supplementalValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUPPLEMENTAL_VALUE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUPPLEMENTAL_VALUE);
			try {
				VALIDATE_SUPPLEMENTAL_VALUE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLEMENTAL_VALUE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLEMENTAL_VALUE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplementalValue)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUPPLEMENTAL_VALUE__SUPPLEMENTAL_VALUE_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SupplementalValueMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(supplementalValue, context) }),
						 new Object [] { supplementalValue }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplementalValueCodeP(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueCodeP(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLEMENTAL_VALUE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplementalValueCodeP(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueCodeP(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUPPLEMENTAL_VALUE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplementalValue The receiving '<em><b>Supplemental Value</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSupplementalValueCodeP(SupplementalValue supplementalValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUPPLEMENTAL_VALUE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUPPLEMENTAL_VALUE);
			try {
				VALIDATE_SUPPLEMENTAL_VALUE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLEMENTAL_VALUE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLEMENTAL_VALUE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplementalValue)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUPPLEMENTAL_VALUE__SUPPLEMENTAL_VALUE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SupplementalValueCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(supplementalValue, context) }),
						 new Object [] { supplementalValue }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplementalValueCode(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueCode(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLEMENTAL_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = 'locally defined' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplementalValueCode(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueCode(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUPPLEMENTAL_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplementalValue The receiving '<em><b>Supplemental Value</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSupplementalValueCode(SupplementalValue supplementalValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUPPLEMENTAL_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUPPLEMENTAL_VALUE);
			try {
				VALIDATE_SUPPLEMENTAL_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLEMENTAL_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLEMENTAL_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplementalValue)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUPPLEMENTAL_VALUE__SUPPLEMENTAL_VALUE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SupplementalValueCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(supplementalValue, context) }),
						 new Object [] { supplementalValue }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplementalValueValue(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueValue(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLEMENTAL_VALUE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplementalValueValue(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueValue(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUPPLEMENTAL_VALUE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplementalValue The receiving '<em><b>Supplemental Value</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSupplementalValueValue(SupplementalValue supplementalValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUPPLEMENTAL_VALUE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUPPLEMENTAL_VALUE);
			try {
				VALIDATE_SUPPLEMENTAL_VALUE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLEMENTAL_VALUE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLEMENTAL_VALUE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplementalValue)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUPPLEMENTAL_VALUE__SUPPLEMENTAL_VALUE_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SupplementalValueValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(supplementalValue, context) }),
						 new Object [] { supplementalValue }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplementalValueOrigenAssociation(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Origen Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueOrigenAssociation(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLEMENTAL_VALUE_ORIGEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplementalValueOrigenAssociation(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Origen Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueOrigenAssociation(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUPPLEMENTAL_VALUE_ORIGEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplementalValue The receiving '<em><b>Supplemental Value</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSupplementalValueOrigenAssociation(SupplementalValue supplementalValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUPPLEMENTAL_VALUE_ORIGEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUPPLEMENTAL_VALUE);
			try {
				VALIDATE_SUPPLEMENTAL_VALUE_ORIGEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLEMENTAL_VALUE_ORIGEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLEMENTAL_VALUE_ORIGEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplementalValue)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUPPLEMENTAL_VALUE__SUPPLEMENTAL_VALUE_ORIGEN_ASSOCIATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SupplementalValueOrigenAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(supplementalValue, context) }),
						 new Object [] { supplementalValue }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplementalValueStudyFindingEvaluator(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Study Finding Evaluator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueStudyFindingEvaluator(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLEMENTAL_VALUE_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::StudyFindingEvaluator))";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplementalValueStudyFindingEvaluator(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supplemental Value Study Finding Evaluator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplementalValueStudyFindingEvaluator(SupplementalValue, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUPPLEMENTAL_VALUE_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param supplementalValue The receiving '<em><b>Supplemental Value</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSupplementalValueStudyFindingEvaluator(SupplementalValue supplementalValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SUPPLEMENTAL_VALUE_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUPPLEMENTAL_VALUE);
			try {
				VALIDATE_SUPPLEMENTAL_VALUE_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLEMENTAL_VALUE_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLEMENTAL_VALUE_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplementalValue)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUPPLEMENTAL_VALUE__SUPPLEMENTAL_VALUE_STUDY_FINDING_EVALUATOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SupplementalValueStudyFindingEvaluator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(supplementalValue, context) }),
						 new Object [] { supplementalValue }));
			}
			 
			return false;
		}
		return true;
	}

} // SupplementalValueOperations