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

import org.openhealthtools.mdht.uml.cda.sdtm.EventPattern;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Event Pattern</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventPattern#validateEventPatternTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventPattern#validateEventPatternClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventPattern#validateEventPatternMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventPattern#validateEventPatternCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventPattern#validateEventPatternCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventPattern#validateEventPatternValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventPattern#validateEventPatternValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventPatternOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventPatternOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventPatternTemplateId(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternTemplateId(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENT_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.36')";

	/**
	 * The cached OCL invariant for the '{@link #validateEventPatternTemplateId(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternTemplateId(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EVENT_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventPattern The receiving '<em><b>Event Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventPatternTemplateId(EventPattern eventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EVENT_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENT_PATTERN);
			try {
				VALIDATE_EVENT_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EVENT_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENT_PATTERN__EVENT_PATTERN_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventPatternTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventPattern, context) }),
						 new Object [] { eventPattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventPatternClassCode(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternClassCode(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateEventPatternClassCode(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternClassCode(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventPattern The receiving '<em><b>Event Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventPatternClassCode(EventPattern eventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENT_PATTERN);
			try {
				VALIDATE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENT_PATTERN__EVENT_PATTERN_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventPatternClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventPattern, context) }),
						 new Object [] { eventPattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventPatternMoodCode(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternMoodCode(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateEventPatternMoodCode(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternMoodCode(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventPattern The receiving '<em><b>Event Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventPatternMoodCode(EventPattern eventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENT_PATTERN);
			try {
				VALIDATE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENT_PATTERN__EVENT_PATTERN_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventPatternMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventPattern, context) }),
						 new Object [] { eventPattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventPatternCodeP(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternCodeP(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEventPatternCodeP(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternCodeP(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventPattern The receiving '<em><b>Event Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventPatternCodeP(EventPattern eventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENT_PATTERN);
			try {
				VALIDATE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENT_PATTERN__EVENT_PATTERN_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventPatternCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventPattern, context) }),
						 new Object [] { eventPattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventPatternCode(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternCode(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C83208' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEventPatternCode(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternCode(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventPattern The receiving '<em><b>Event Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventPatternCode(EventPattern eventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENT_PATTERN);
			try {
				VALIDATE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENT_PATTERN__EVENT_PATTERN_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventPatternCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventPattern, context) }),
						 new Object [] { eventPattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventPatternValue(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternValue(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateEventPatternValue(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternValue(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventPattern The receiving '<em><b>Event Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventPatternValue(EventPattern eventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENT_PATTERN);
			try {
				VALIDATE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENT_PATTERN__EVENT_PATTERN_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventPatternValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventPattern, context) }),
						 new Object [] { eventPattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventPatternValueP(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternValueP(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENT_PATTERN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateEventPatternValueP(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Pattern Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventPatternValueP(EventPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EVENT_PATTERN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventPattern The receiving '<em><b>Event Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventPatternValueP(EventPattern eventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EVENT_PATTERN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENT_PATTERN);
			try {
				VALIDATE_EVENT_PATTERN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_PATTERN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EVENT_PATTERN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENT_PATTERN__EVENT_PATTERN_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventPatternValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventPattern, context) }),
						 new Object [] { eventPattern }));
			}
			 
			return false;
		}
		return true;
	}

} // EventPatternOperations