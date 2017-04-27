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
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Eventor Finding Severity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity#validateEventorFindingSeverityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity#validateEventorFindingSeverityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity#validateEventorFindingSeverityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity#validateEventorFindingSeverityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity#validateEventorFindingSeverityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity#validateEventorFindingSeverityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity#validateEventorFindingSeverityValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventorFindingSeverityOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventorFindingSeverityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventorFindingSeverityTemplateId(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityTemplateId(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENTOR_FINDING_SEVERITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.34')";

	/**
	 * The cached OCL invariant for the '{@link #validateEventorFindingSeverityTemplateId(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityTemplateId(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EVENTOR_FINDING_SEVERITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventorFindingSeverity The receiving '<em><b>Eventor Finding Severity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventorFindingSeverityTemplateId(EventorFindingSeverity eventorFindingSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EVENTOR_FINDING_SEVERITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENTOR_FINDING_SEVERITY);
			try {
				VALIDATE_EVENTOR_FINDING_SEVERITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EVENTOR_FINDING_SEVERITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EVENTOR_FINDING_SEVERITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(eventorFindingSeverity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENTOR_FINDING_SEVERITY__EVENTOR_FINDING_SEVERITY_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventorFindingSeverityEventorFindingSeverityTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventorFindingSeverity, context) }),
						 new Object [] { eventorFindingSeverity }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventorFindingSeverityClassCode(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityClassCode(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENTOR_FINDING_SEVERITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateEventorFindingSeverityClassCode(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityClassCode(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EVENTOR_FINDING_SEVERITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventorFindingSeverity The receiving '<em><b>Eventor Finding Severity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventorFindingSeverityClassCode(EventorFindingSeverity eventorFindingSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EVENTOR_FINDING_SEVERITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENTOR_FINDING_SEVERITY);
			try {
				VALIDATE_EVENTOR_FINDING_SEVERITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EVENTOR_FINDING_SEVERITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EVENTOR_FINDING_SEVERITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(eventorFindingSeverity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENTOR_FINDING_SEVERITY__EVENTOR_FINDING_SEVERITY_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventorFindingSeverityEventorFindingSeverityClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventorFindingSeverity, context) }),
						 new Object [] { eventorFindingSeverity }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventorFindingSeverityMoodCode(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityMoodCode(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENTOR_FINDING_SEVERITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateEventorFindingSeverityMoodCode(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityMoodCode(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EVENTOR_FINDING_SEVERITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventorFindingSeverity The receiving '<em><b>Eventor Finding Severity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventorFindingSeverityMoodCode(EventorFindingSeverity eventorFindingSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EVENTOR_FINDING_SEVERITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENTOR_FINDING_SEVERITY);
			try {
				VALIDATE_EVENTOR_FINDING_SEVERITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EVENTOR_FINDING_SEVERITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EVENTOR_FINDING_SEVERITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(eventorFindingSeverity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENTOR_FINDING_SEVERITY__EVENTOR_FINDING_SEVERITY_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventorFindingSeverityEventorFindingSeverityMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventorFindingSeverity, context) }),
						 new Object [] { eventorFindingSeverity }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventorFindingSeverityCodeP(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityCodeP(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENTOR_FINDING_SEVERITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEventorFindingSeverityCodeP(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityCodeP(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EVENTOR_FINDING_SEVERITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventorFindingSeverity The receiving '<em><b>Eventor Finding Severity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventorFindingSeverityCodeP(EventorFindingSeverity eventorFindingSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EVENTOR_FINDING_SEVERITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENTOR_FINDING_SEVERITY);
			try {
				VALIDATE_EVENTOR_FINDING_SEVERITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EVENTOR_FINDING_SEVERITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EVENTOR_FINDING_SEVERITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(eventorFindingSeverity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENTOR_FINDING_SEVERITY__EVENTOR_FINDING_SEVERITY_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventorFindingSeverityEventorFindingSeverityCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventorFindingSeverity, context) }),
						 new Object [] { eventorFindingSeverity }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventorFindingSeverityCode(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityCode(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENTOR_FINDING_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C66769' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEventorFindingSeverityCode(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityCode(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EVENTOR_FINDING_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventorFindingSeverity The receiving '<em><b>Eventor Finding Severity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventorFindingSeverityCode(EventorFindingSeverity eventorFindingSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EVENTOR_FINDING_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENTOR_FINDING_SEVERITY);
			try {
				VALIDATE_EVENTOR_FINDING_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EVENTOR_FINDING_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EVENTOR_FINDING_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(eventorFindingSeverity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENTOR_FINDING_SEVERITY__EVENTOR_FINDING_SEVERITY_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventorFindingSeverityEventorFindingSeverityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventorFindingSeverity, context) }),
						 new Object [] { eventorFindingSeverity }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventorFindingSeverityValue(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityValue(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENTOR_FINDING_SEVERITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateEventorFindingSeverityValue(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityValue(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EVENTOR_FINDING_SEVERITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventorFindingSeverity The receiving '<em><b>Eventor Finding Severity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventorFindingSeverityValue(EventorFindingSeverity eventorFindingSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EVENTOR_FINDING_SEVERITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENTOR_FINDING_SEVERITY);
			try {
				VALIDATE_EVENTOR_FINDING_SEVERITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EVENTOR_FINDING_SEVERITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EVENTOR_FINDING_SEVERITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(eventorFindingSeverity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENTOR_FINDING_SEVERITY__EVENTOR_FINDING_SEVERITY_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventorFindingSeverityEventorFindingSeverityValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventorFindingSeverity, context) }),
						 new Object [] { eventorFindingSeverity }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEventorFindingSeverityValueP(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityValueP(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EVENTOR_FINDING_SEVERITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateEventorFindingSeverityValueP(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eventor Finding Severity Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEventorFindingSeverityValueP(EventorFindingSeverity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EVENTOR_FINDING_SEVERITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eventorFindingSeverity The receiving '<em><b>Eventor Finding Severity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEventorFindingSeverityValueP(EventorFindingSeverity eventorFindingSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EVENTOR_FINDING_SEVERITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.EVENTOR_FINDING_SEVERITY);
			try {
				VALIDATE_EVENTOR_FINDING_SEVERITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EVENTOR_FINDING_SEVERITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EVENTOR_FINDING_SEVERITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(eventorFindingSeverity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.EVENTOR_FINDING_SEVERITY__EVENTOR_FINDING_SEVERITY_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventorFindingSeverityEventorFindingSeverityValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventorFindingSeverity, context) }),
						 new Object [] { eventorFindingSeverity }));
			}
			 
			return false;
		}
		return true;
	}

} // EventorFindingSeverityOperations