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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.emspcr.CallTime;
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime;
import org.openhealthtools.mdht.uml.cda.emspcr.TimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Times Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionCallTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Call Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionUnitNotifiedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit Notified Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionUnitEnRouteTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit En Route Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionUnitOnSceneTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit On Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionUnitAtPatienttTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit At Patientt Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionUnitLeftSceneTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit Left Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionPatientArrivedAtDestinationTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Patient Arrived At Destination Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionUnitBackInServiceTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit Back In Service Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionDispatchNotifiedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Dispatch Notified Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getCallTime() <em>Get Call Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getUnitNotifiedTime() <em>Get Unit Notified Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getUnitEnRouteTime() <em>Get Unit En Route Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getUnitOnSceneTime() <em>Get Unit On Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getUnitAtPatienttTime() <em>Get Unit At Patientt Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getUnitLeftSceneTime() <em>Get Unit Left Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getPatientArrivedAtDestinationTime() <em>Get Patient Arrived At Destination Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getUnitBackInServiceTime() <em>Get Unit Back In Service Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getDispatchNotifiedTime() <em>Get Dispatch Notified Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimesSectionOperations extends org.eclipse.mdht.uml.cda.operations.SectionOperations {
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
	protected TimesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionTemplateId(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionTemplateId(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.10')";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionTemplateId(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionTemplateId(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionTemplateId(TimesSection timesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionTemplateId"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionCode(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionCode(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67667-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionCode(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionCode(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionCode(TimesSection timesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionCode"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionTitle(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionTitle(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Times')";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionTitle(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionTitle(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionTitle(TimesSection timesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionTitle"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionText(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionText(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionText(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionText(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionText(TimesSection timesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionText"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionCallTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Call Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionCallTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::CallTime) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionCallTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Call Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionCallTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionCallTime(TimesSection timesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_CALL_TIME,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionCallTime"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionUnitNotifiedTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit Notified Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionUnitNotifiedTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitNotifiedTime) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionUnitNotifiedTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit Notified Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionUnitNotifiedTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionUnitNotifiedTime(TimesSection timesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_UNIT_NOTIFIED_TIME,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionUnitNotifiedTime"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionUnitEnRouteTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit En Route Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionUnitEnRouteTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitEnRouteTime) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionUnitEnRouteTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit En Route Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionUnitEnRouteTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionUnitEnRouteTime(TimesSection timesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_UNIT_EN_ROUTE_TIME,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionUnitEnRouteTime"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionUnitOnSceneTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit On Scene Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionUnitOnSceneTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitOnSceneTime) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionUnitOnSceneTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit On Scene Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionUnitOnSceneTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionUnitOnSceneTime(TimesSection timesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_UNIT_ON_SCENE_TIME,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionUnitOnSceneTime"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionUnitAtPatienttTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit At Patientt Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionUnitAtPatienttTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitAtPatientTime) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionUnitAtPatienttTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit At Patientt Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionUnitAtPatienttTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionUnitAtPatienttTime(TimesSection timesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_UNIT_AT_PATIENTT_TIME,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionUnitAtPatienttTime"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionUnitLeftSceneTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit Left Scene Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionUnitLeftSceneTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitLeftSceneTime) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionUnitLeftSceneTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit Left Scene Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionUnitLeftSceneTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionUnitLeftSceneTime(TimesSection timesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_UNIT_LEFT_SCENE_TIME,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionUnitLeftSceneTime"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionPatientArrivedAtDestinationTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Patient Arrived At Destination Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionPatientArrivedAtDestinationTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientArrivedAtDestinationTime) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionPatientArrivedAtDestinationTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Patient Arrived At Destination Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionPatientArrivedAtDestinationTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionPatientArrivedAtDestinationTime(TimesSection timesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionPatientArrivedAtDestinationTime"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionUnitBackInServiceTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit Back In Service Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionUnitBackInServiceTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitBackInServiceTime) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionUnitBackInServiceTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit Back In Service Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionUnitBackInServiceTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionUnitBackInServiceTime(TimesSection timesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionUnitBackInServiceTime"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimesSectionDispatchNotifiedTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Dispatch Notified Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionDispatchNotifiedTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::DispatchNotifiedTime) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTimesSectionDispatchNotifiedTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Dispatch Notified Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimesSectionDispatchNotifiedTime(TimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timesSection The receiving '<em><b>Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTimesSectionDispatchNotifiedTime(TimesSection timesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TIMES_SECTION);
			try {
				VALIDATE_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TIMES_SECTION__TIMES_SECTION_DISPATCH_NOTIFIED_TIME,
						 EmspcrPlugin.INSTANCE.getString("TimesSectionTimesSectionDispatchNotifiedTime"),
						 new Object [] { timesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCallTime(TimesSection) <em>Get Call Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CALL_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CallTime))->asSequence()->any(true).oclAsType(emspcr::CallTime)";

	/**
	 * The cached OCL query for the '{@link #getCallTime(TimesSection) <em>Get Call Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CALL_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static CallTime getCallTime(TimesSection timesSection) {
	
	
	
		if (GET_CALL_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.TIMES_SECTION, EmspcrPackage.Literals.TIMES_SECTION.getEAllOperations().get(68));
			try {
				GET_CALL_TIME__EOCL_QRY = helper.createQuery(GET_CALL_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CALL_TIME__EOCL_QRY);
		return (CallTime) query.evaluate(timesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitNotifiedTime(TimesSection) <em>Get Unit Notified Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitNotifiedTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_NOTIFIED_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitNotifiedTime))->asSequence()->any(true).oclAsType(emspcr::UnitNotifiedTime)";

	/**
	 * The cached OCL query for the '{@link #getUnitNotifiedTime(TimesSection) <em>Get Unit Notified Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitNotifiedTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_NOTIFIED_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static UnitNotifiedTime getUnitNotifiedTime(TimesSection timesSection) {
	
	
	
		if (GET_UNIT_NOTIFIED_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.TIMES_SECTION, EmspcrPackage.Literals.TIMES_SECTION.getEAllOperations().get(69));
			try {
				GET_UNIT_NOTIFIED_TIME__EOCL_QRY = helper.createQuery(GET_UNIT_NOTIFIED_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_NOTIFIED_TIME__EOCL_QRY);
		return (UnitNotifiedTime) query.evaluate(timesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitEnRouteTime(TimesSection) <em>Get Unit En Route Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitEnRouteTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_EN_ROUTE_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitEnRouteTime))->asSequence()->any(true).oclAsType(emspcr::UnitEnRouteTime)";

	/**
	 * The cached OCL query for the '{@link #getUnitEnRouteTime(TimesSection) <em>Get Unit En Route Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitEnRouteTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_EN_ROUTE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static UnitEnRouteTime getUnitEnRouteTime(TimesSection timesSection) {
	
	
	
		if (GET_UNIT_EN_ROUTE_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.TIMES_SECTION, EmspcrPackage.Literals.TIMES_SECTION.getEAllOperations().get(70));
			try {
				GET_UNIT_EN_ROUTE_TIME__EOCL_QRY = helper.createQuery(GET_UNIT_EN_ROUTE_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_EN_ROUTE_TIME__EOCL_QRY);
		return (UnitEnRouteTime) query.evaluate(timesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitOnSceneTime(TimesSection) <em>Get Unit On Scene Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOnSceneTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_ON_SCENE_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitOnSceneTime))->asSequence()->any(true).oclAsType(emspcr::UnitOnSceneTime)";

	/**
	 * The cached OCL query for the '{@link #getUnitOnSceneTime(TimesSection) <em>Get Unit On Scene Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOnSceneTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_ON_SCENE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static UnitOnSceneTime getUnitOnSceneTime(TimesSection timesSection) {
	
	
	
		if (GET_UNIT_ON_SCENE_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.TIMES_SECTION, EmspcrPackage.Literals.TIMES_SECTION.getEAllOperations().get(71));
			try {
				GET_UNIT_ON_SCENE_TIME__EOCL_QRY = helper.createQuery(GET_UNIT_ON_SCENE_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_ON_SCENE_TIME__EOCL_QRY);
		return (UnitOnSceneTime) query.evaluate(timesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitAtPatienttTime(TimesSection) <em>Get Unit At Patientt Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitAtPatienttTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_AT_PATIENTT_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitAtPatientTime))->asSequence()->any(true).oclAsType(emspcr::UnitAtPatientTime)";

	/**
	 * The cached OCL query for the '{@link #getUnitAtPatienttTime(TimesSection) <em>Get Unit At Patientt Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitAtPatienttTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_AT_PATIENTT_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static UnitAtPatientTime getUnitAtPatienttTime(TimesSection timesSection) {
	
	
	
		if (GET_UNIT_AT_PATIENTT_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.TIMES_SECTION, EmspcrPackage.Literals.TIMES_SECTION.getEAllOperations().get(72));
			try {
				GET_UNIT_AT_PATIENTT_TIME__EOCL_QRY = helper.createQuery(GET_UNIT_AT_PATIENTT_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_AT_PATIENTT_TIME__EOCL_QRY);
		return (UnitAtPatientTime) query.evaluate(timesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitLeftSceneTime(TimesSection) <em>Get Unit Left Scene Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitLeftSceneTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_LEFT_SCENE_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitLeftSceneTime))->asSequence()->any(true).oclAsType(emspcr::UnitLeftSceneTime)";

	/**
	 * The cached OCL query for the '{@link #getUnitLeftSceneTime(TimesSection) <em>Get Unit Left Scene Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitLeftSceneTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_LEFT_SCENE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static UnitLeftSceneTime getUnitLeftSceneTime(TimesSection timesSection) {
	
	
	
		if (GET_UNIT_LEFT_SCENE_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.TIMES_SECTION, EmspcrPackage.Literals.TIMES_SECTION.getEAllOperations().get(73));
			try {
				GET_UNIT_LEFT_SCENE_TIME__EOCL_QRY = helper.createQuery(GET_UNIT_LEFT_SCENE_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_LEFT_SCENE_TIME__EOCL_QRY);
		return (UnitLeftSceneTime) query.evaluate(timesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientArrivedAtDestinationTime(TimesSection) <em>Get Patient Arrived At Destination Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientArrivedAtDestinationTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_ARRIVED_AT_DESTINATION_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientArrivedAtDestinationTime))->asSequence()->any(true).oclAsType(emspcr::PatientArrivedAtDestinationTime)";

	/**
	 * The cached OCL query for the '{@link #getPatientArrivedAtDestinationTime(TimesSection) <em>Get Patient Arrived At Destination Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientArrivedAtDestinationTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_ARRIVED_AT_DESTINATION_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PatientArrivedAtDestinationTime getPatientArrivedAtDestinationTime(TimesSection timesSection) {
	
	
	
		if (GET_PATIENT_ARRIVED_AT_DESTINATION_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.TIMES_SECTION, EmspcrPackage.Literals.TIMES_SECTION.getEAllOperations().get(74));
			try {
				GET_PATIENT_ARRIVED_AT_DESTINATION_TIME__EOCL_QRY = helper.createQuery(GET_PATIENT_ARRIVED_AT_DESTINATION_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PATIENT_ARRIVED_AT_DESTINATION_TIME__EOCL_QRY);
		return (PatientArrivedAtDestinationTime) query.evaluate(timesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitBackInServiceTime(TimesSection) <em>Get Unit Back In Service Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitBackInServiceTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_BACK_IN_SERVICE_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitBackInServiceTime))->asSequence()->any(true).oclAsType(emspcr::UnitBackInServiceTime)";

	/**
	 * The cached OCL query for the '{@link #getUnitBackInServiceTime(TimesSection) <em>Get Unit Back In Service Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitBackInServiceTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_BACK_IN_SERVICE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static UnitBackInServiceTime getUnitBackInServiceTime(TimesSection timesSection) {
	
	
	
		if (GET_UNIT_BACK_IN_SERVICE_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.TIMES_SECTION, EmspcrPackage.Literals.TIMES_SECTION.getEAllOperations().get(75));
			try {
				GET_UNIT_BACK_IN_SERVICE_TIME__EOCL_QRY = helper.createQuery(GET_UNIT_BACK_IN_SERVICE_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_BACK_IN_SERVICE_TIME__EOCL_QRY);
		return (UnitBackInServiceTime) query.evaluate(timesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDispatchNotifiedTime(TimesSection) <em>Get Dispatch Notified Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchNotifiedTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISPATCH_NOTIFIED_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::DispatchNotifiedTime))->asSequence()->any(true).oclAsType(emspcr::DispatchNotifiedTime)";

	/**
	 * The cached OCL query for the '{@link #getDispatchNotifiedTime(TimesSection) <em>Get Dispatch Notified Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchNotifiedTime(TimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISPATCH_NOTIFIED_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DispatchNotifiedTime getDispatchNotifiedTime(TimesSection timesSection) {
	
	
	
		if (GET_DISPATCH_NOTIFIED_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.TIMES_SECTION, EmspcrPackage.Literals.TIMES_SECTION.getEAllOperations().get(76));
			try {
				GET_DISPATCH_NOTIFIED_TIME__EOCL_QRY = helper.createQuery(GET_DISPATCH_NOTIFIED_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DISPATCH_NOTIFIED_TIME__EOCL_QRY);
		return (DispatchNotifiedTime) query.evaluate(timesSection);
	}

} // TimesSectionOperations
