/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectivesSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directives Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Has Advance Directive Observation2 Xor Advance Directive Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2Entry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Advance Directive Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Advance Directive Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#getConsolAdvanceDirectiveOrganizers() <em>Get Consol Advance Directive Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#getConsolAdvanceDirectiveObservation2s() <em>Get Consol Advance Directive Observation2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectivesSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizerTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION2_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AdvanceDirectivesSection2 target) {
						// blank
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AdvanceDirectivesSection2 target) {
						// incorrect nullFlavor and no entries that are required supplied
						target.init();
						target.setNullFlavor(NullFlavor.ASKU);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AdvanceDirectivesSection2 target) {
						// both entries (only allowed one or more of each option) without a nullFlavor
						target.addOrganizer(ConsolFactory.eINSTANCE.createAdvanceDirectiveOrganizer().init());
						target.addObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2().init());
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AdvanceDirectivesSection2 target) {
						target.init();
						target.setNullFlavor(NullFlavor.ASKU);
						// both entries with incorrect nullFlavor so it still fails
						target.addOrganizer(ConsolFactory.eINSTANCE.createAdvanceDirectiveOrganizer().init());
						target.addObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2().init());
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AdvanceDirectivesSection2 target) {
						target.init();
						target.setNullFlavor(NullFlavor.NI); // NI removes requirements
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AdvanceDirectivesSection2 target) {
						// target.init defaults to a nullFlavor of NI so not initializing for the test
						// 1 AdvanceDirectiveOrganizer
						target.addOrganizer(ConsolFactory.eINSTANCE.createAdvanceDirectiveOrganizer().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AdvanceDirectivesSection2 target) {
						// could also change NI to something else
						target.init();
						target.setNullFlavor(NullFlavor.ASKU);
						// 2 AdvanceDirectiveOrganizers
						target.addOrganizer(ConsolFactory.eINSTANCE.createAdvanceDirectiveOrganizer().init());
						target.addOrganizer(ConsolFactory.eINSTANCE.createAdvanceDirectiveOrganizer().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AdvanceDirectivesSection2 target) {
						target.init();
						target.setNullFlavor(NullFlavor.ASKU);
						// 1 AdvanceDirectiveObservation2s
						target.addObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AdvanceDirectivesSection2 target) {
						// 2 AdvanceDirectiveObservation2s
						target.addObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2().init());
						target.addObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AdvanceDirectivesSection2 target) {
						target.init();
						target.setNullFlavor(NullFlavor.NI);
						// Both entries but nullFlavor negates the requirement and allows a pass
						target.addOrganizer(ConsolFactory.eINSTANCE.createAdvanceDirectiveOrganizer().init());
						target.addObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSection2NullFlavor() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2NullFlavorTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2NullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2NullFlavor(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2NullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectivesSection2Entry() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2EntryTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2Entry",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {
				target.init();
				target.setNullFlavor(NullFlavor.ASKU);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AdvanceDirectivesSection2 target) {
						Entry entry = CDAFactory.eINSTANCE.createEntry();
						target.getEntries().add(entry);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AdvanceDirectivesSection2 target) {
						target.init();
						target.setNullFlavor(NullFlavor.NI);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2Entry(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2EntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizerTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {
				target.init();
				Entry entry = CDAFactory.eINSTANCE.createEntry();
				target.getEntries().add(entry);
			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.getEntries().get(0).setOrganizer(
					ConsolFactory.eINSTANCE.createAdvanceDirectiveOrganizer().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2TestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {
				target.init();
				Entry entry = CDAFactory.eINSTANCE.createEntry();
				target.getEntries().add(entry);
			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.getEntries().get(0).setObservation(
					ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSectionEntriesOptionalTemplateId(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAdvanceDirectiveObservation2s() {

		AdvanceDirectivesSection2 target = objectFactory.create();
		target.getConsolAdvanceDirectiveObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAdvanceDirectiveOrganizers() {

		AdvanceDirectivesSection2 target = objectFactory.create();
		target.getConsolAdvanceDirectiveOrganizers();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectivesSection2Operations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectivesSection2> {
		@Override
		public AdvanceDirectivesSection2 create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectivesSection2();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends AdvanceDirectivesSection2Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // AdvanceDirectivesSection2Operations
